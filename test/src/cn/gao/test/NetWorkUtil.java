package cn.gao.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class NetWorkUtil{
    private static final int SLEEP_TIME = 2*1000 ;

    //��ȡ�������������ٶ�
    public static Map<String,String> getNetworkDownUp(){
        Properties props = System.getProperties();
        String os = props.getProperty("os.name").toLowerCase();
        os = os.startsWith("win")?"windows":"linux";
        Map<String,String> result = new HashMap<>();
        Process pro = null;
        Runtime r = Runtime.getRuntime();
        BufferedReader input = null;
        String rxPercent = "";
        String txPercent = "";
        try {
            String command = "windows".equals(os)?"netstat -e":"ifconfig";
            pro = r.exec(command);
            input = new BufferedReader(new InputStreamReader(pro.getInputStream()));
            long result1[] = readInLine(input, os);
            Thread.sleep(SLEEP_TIME);
            pro.destroy();
            input.close();
            pro = r.exec(command);
            input = new BufferedReader(new InputStreamReader(pro.getInputStream()));
            long result2[] = readInLine(input, os);
            rxPercent = formatNumber((result2[0]-result1[0])/(1024.0*(SLEEP_TIME / 1000))); // ��������(kB/s)
            txPercent = formatNumber((result2[1]-result1[1])/(1024.0*(SLEEP_TIME / 1000))); // ��������(kB/s)
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            if(input!=null){
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            Optional.ofNullable(pro).ifPresent(p->p.destroy());
        }
        result.put("rxPercent",rxPercent);// ��������
        result.put("txPercent",txPercent);// ��������
        return result;

    }

    private static long[] readInLine(BufferedReader input, String osType) {
        long arr[] = new long[2];
        StringTokenizer tokenStat = null;
        try {
            if (osType.equals("linux")) { // ��ȡlinux�����µ���������������
                long rx=0,tx = 0;
                String line = null;
                //RX packets:4171603 errors:0 dropped:0 overruns:0 frame:0
                //TX packets:4171603 errors:0 dropped:0 overruns:0 carrier:0
                while((line=input.readLine())!=null){
                    if(line.indexOf("RX packets")>=0){
                        rx+=Long.parseLong(line.substring(line.indexOf("RX packets")+11,line.indexOf(" ",line.indexOf("RX packets")+11)));
                    }else if(line.indexOf("TX packets")>=0){
                        tx+=Long.parseLong(line.substring(line.indexOf("TX packets")+11,line.indexOf(" ",line.indexOf("TX packets")+11)));
                    }
                }
                arr[0]=rx;
                arr[1]=tx;
            } else { // ��ȡwindows�����µ���������������
                input.readLine();
                input.readLine();
                input.readLine();
                input.readLine();
                tokenStat = new StringTokenizer(input.readLine());
                tokenStat.nextToken();
                arr[0] = Long.parseLong(tokenStat.nextToken());
                arr[1] = Long.parseLong(tokenStat.nextToken());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arr;
    }

    private static String formatNumber(double f) {
        return new Formatter().format("%.2f", f).toString();
    }
}
