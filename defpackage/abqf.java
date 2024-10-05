package defpackage;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abqf {
    public final String a;
    public final NumberFormat b;
    public final Locale c;
    public Currency d;
    public String e;
    public boolean f;

    public abqf(String str, String str2) {
        this.a = str;
        try {
            Currency currency = Currency.getInstance(str);
            this.d = currency;
            this.e = currency.getSymbol();
        } catch (IllegalArgumentException e) {
            if ("BYN".equals(str)) {
                this.d = Currency.getInstance("BYR");
                this.e = "BYN";
                this.f = true;
            } else {
                throw e;
            }
        }
        if (str2.isEmpty()) {
            this.c = Locale.getDefault();
        } else {
            String[] strArr = (String[]) amnm.c("_").h(str2).toArray(new String[0]);
            if (strArr.length == 2) {
                this.c = new Locale(strArr[0], strArr[1]);
            } else {
                this.c = Locale.getDefault();
            }
        }
        NumberFormat numberFormat = NumberFormat.getInstance(this.c);
        this.b = numberFormat;
        numberFormat.setCurrency(this.d);
        numberFormat.setMaximumFractionDigits(this.d.getDefaultFractionDigits());
        numberFormat.setMinimumFractionDigits(this.d.getDefaultFractionDigits());
    }
}
