package exam;

public class Annotation {
	
}

//@OperationLogNeeded(optType = OperationType.DELETE, pkpos = 1, entityClass = ServerGroup.class)
//
//@Target(METHOD)
//@Retention(RUNTIME)
//public @interface OperationLogNeeded {
//
//   OperationType optType() default OperationType.UNKNOWN;
//
//   Class<?> entityClass() default Object.class;
//
//   int pkpos() default 0;
//
//}
//
//
//@Target(METHOD)
//@Retention(RUNTIME)
//public @interface OperationLogIgnore {
//
//}
//
//private OperationLogIgnore getIgnoreAnnotation(JoinPoint joinPoint)
//   {
//      try
//      {
//         Method proxyMethod = ((MethodSignature)joinPoint.getSignature()).getMethod();
//         Method soruceMethod = joinPoint.getTarget().getClass().getMethod(proxyMethod.getName(), proxyMethod.getParameterTypes());
//         if (soruceMethod.isAnnotationPresent(OperationLogIgnore.class))
//         {
//            OperationLogIgnore oli = soruceMethod.getAnnotation(OperationLogIgnore.class);
//            return oli;
//         }
//      }
//      catch (Exception e)
//      {
//         logger.error("error", e);
//      }
//      return null;
//   }
