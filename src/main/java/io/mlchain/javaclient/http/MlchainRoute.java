package io.mlchain.javaclient.http;

/**
 * @author Ziyao_Zhu
 */
public class MlchainRoute {
    public String method;
    public  String url;

    public MlchainRoute(String method, String url) {
        this.method = method;
        this.url = url;
    }
}