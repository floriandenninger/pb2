package j$.util.stream;

import j$.util.function.BiConsumer;
import j$.util.function.BinaryOperator;
import j$.util.function.Function;
import j$.util.function.Supplier;
import j$.util.stream.Collectors;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/* loaded from: classes5.dex */
public interface Collector {

    /* loaded from: classes5.dex */
    public enum Characteristics {
        CONCURRENT,
        UNORDERED,
        IDENTITY_FINISH
    }

    BiConsumer accumulator();

    Set characteristics();

    BinaryOperator combiner();

    Function finisher();

    Supplier supplier();

    /* renamed from: j$.util.stream.Collector$-CC, reason: invalid class name */
    /* loaded from: classes5.dex */
    public final /* synthetic */ class CC {
        public static Collector of(Supplier supplier, BiConsumer biConsumer, BinaryOperator binaryOperator, Function function, Characteristics... characteristicsArr) {
            supplier.getClass();
            biConsumer.getClass();
            binaryOperator.getClass();
            function.getClass();
            characteristicsArr.getClass();
            Set set = Collectors.CH_NOID;
            if (characteristicsArr.length > 0) {
                EnumSet noneOf = EnumSet.noneOf(Characteristics.class);
                Collections.addAll(noneOf, characteristicsArr);
                set = Collections.unmodifiableSet(noneOf);
            }
            return new Collectors.CollectorImpl(supplier, biConsumer, binaryOperator, function, set);
        }
    }
}
