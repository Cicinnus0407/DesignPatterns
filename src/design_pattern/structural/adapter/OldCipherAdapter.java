package design_pattern.structural.adapter;

/**
 * Created by Cicinnus on 2017/9/27.
 */
public class OldCipherAdapter extends DataOperation {
    private OldCipher oldCipher;

    public OldCipherAdapter( ) {
        oldCipher = new OldCipher();
    }

    @Override
    public String encrypt(int key, String pwd) {
        return oldCipher.doEncrypt(key,pwd);
    }
}
