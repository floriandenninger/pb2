package j$.util.function;

import j$.util.function.BiFunction;

/* loaded from: classes5.dex */
public interface BiFunction {
    BiFunction andThen(Function function);

    Object apply(Object obj, Object obj2);

    /* renamed from: j$.util.function.BiFunction$-CC, reason: invalid class name */
    /* loaded from: classes5.dex */
    public final /* synthetic */ class CC {
        public static BiFunction $default$andThen(final BiFunction biFunction, final Function function) {
            function.getClass();
            return new BiFunction() { // from class: j$.util.function.BiFunction$$ExternalSyntheticLambda0
                @Override // j$.util.function.BiFunction
                public /* synthetic */ BiFunction andThen(Function function2) {
                    return BiFunction.CC.$default$andThen(this, function2);
                }

                @Override // j$.util.function.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    Object apply;
                    apply = function.apply(BiFunction.this.apply(obj, obj2));
                    return apply;
                }
            };
        }
    }
}
