package defpackage;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tdr {
    public static final DecimalFormatSymbols a;
    public static final DecimalFormat b;
    public static final DecimalFormat c;

    static {
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        a = decimalFormatSymbols;
        b = new DecimalFormat("0.00", decimalFormatSymbols);
        c = new DecimalFormat("0.000", decimalFormatSymbols);
    }
}
