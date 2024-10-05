package j$.util.function;

import j$.util.function.Function;

/* loaded from: classes5.dex */
public interface Function {
    Function andThen(Function function);

    Object apply(Object obj);

    Function compose(Function function);

    /* renamed from: j$.util.function.Function$-CC, reason: invalid class name */
    /* loaded from: classes5.dex */
    public final /* synthetic */ class CC {
        public static Function $default$compose(final Function function, final Function function2) {
            function2.getClass();
            return new Function() { // from class: j$.util.function.Function$$ExternalSyntheticLambda1
                @Override // j$.util.function.Function
                public /* synthetic */ Function andThen(Function function3) {
                    return Function.CC.$default$andThen(this, function3);
                }

                @Override // j$.util.function.Function
                public final Object apply(Object obj) {
                    Object apply;
                    apply = Function.this.apply(function2.apply(obj));
                    return apply;
                }

                @Override // j$.util.function.Function
                public /* synthetic */ Function compose(Function function3) {
                    return Function.CC.$default$compose(this, function3);
                }
            };
        }

        public static Function $default$andThen(final Function function, final Function function2) {
            function2.getClass();
            return new Function() { // from class: j$.util.function.Function$$ExternalSyntheticLambda0
                @Override // j$.util.function.Function
                public /* synthetic */ Function andThen(Function function3) {
                    return Function.CC.$default$andThen(this, function3);
                }

                @Override // j$.util.function.Function
                public final Object apply(Object obj) {
                    Object apply;
                    apply = function2.apply(Function.this.apply(obj));
                    return apply;
                }

                @Override // j$.util.function.Function
                public /* synthetic */ Function compose(Function function3) {
                    return Function.CC.$default$compose(this, function3);
                }
            };
        }
    }
}
