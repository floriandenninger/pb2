package j$.util.function;

import j$.util.function.BiFunction;
import j$.util.function.BinaryOperator;
import java.util.Comparator;

/* loaded from: classes5.dex */
public interface BinaryOperator extends BiFunction {

    /* renamed from: j$.util.function.BinaryOperator$-CC, reason: invalid class name */
    /* loaded from: classes5.dex */
    public abstract /* synthetic */ class CC {
        public static BinaryOperator maxBy(final Comparator comparator) {
            comparator.getClass();
            return new BinaryOperator() { // from class: j$.util.function.BinaryOperator$$ExternalSyntheticLambda0
                @Override // j$.util.function.BiFunction
                public /* synthetic */ BiFunction andThen(Function function) {
                    return BiFunction.CC.$default$andThen(this, function);
                }

                @Override // j$.util.function.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    return BinaryOperator.CC.lambda$maxBy$1(comparator, obj, obj2);
                }
            };
        }

        public static /* synthetic */ Object lambda$maxBy$1(Comparator comparator, Object obj, Object obj2) {
            return comparator.compare(obj, obj2) >= 0 ? obj : obj2;
        }
    }
}
