package design_pattern.structural.bridge;

/**
 * Created by Cicinnus on 2017/9/30.
 */
public abstract class AbstractFile {
    protected ExactDataImpl exactDataImpl;
    public void setExactDataImpl(ExactDataImpl exactDataImpl){
        this.exactDataImpl = exactDataImpl;
    }

    public abstract void convert(  );

}
