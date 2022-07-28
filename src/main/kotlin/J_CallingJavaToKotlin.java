/**
 * Calling code from Java to Kotlin
 * <p>
 * 1. Imp: In kotlin class name is not mandatory but still File Name
 * will be treated as Class Name
 * <p>
 * Note the name 'Kt' in file name (I_ParamsKt)
 * <p>
 * 2. With the help of @file annotation Kotlin FileName can be updated as per our choice
 *
 * @file:JvmName("MyParams")
 */

public class J_CallingJavaToKotlin {

    public static void main(String[] args) {

        //var max = I_ParamsKt.findMaxNumber(500, 200);  //Working
        var max = MyParams.findMaxNumber(400, 200);
        System.out.println("Java Main Method: " + max);
        System.out.println("=========== ProdBug ==========");
    }
}
