package mylambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaFunctionHandler implements RequestHandler<Object, Object> {

    @Override
    public Object handleRequest(Object input, Context context) {
    	System.out.println("where will this print?? "+input);
        context.getLogger().log("Input: " + input);

        // TODO: implement your handler
        return null;
    }

}
