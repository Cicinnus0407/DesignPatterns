package design_pattern.structural.adapter;

/**
 * Created by Cicinnus on 2017/9/27.
 */
public class NewCipherAdapter extends DataOperation {
    private NewCipher newCipher;

    public NewCipherAdapter() {
        newCipher = new NewCipher();
    }

    @Override
    public String encrypt(int key, String pwd) {
        return newCipher.encrypt(key,pwd);
    }
}
