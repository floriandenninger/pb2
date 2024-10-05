package defpackage;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dyg implements dyn {
    public final Double a;

    public dyg(Double d) {
        if (d == null) {
            this.a = Double.valueOf(Double.NaN);
        } else {
            this.a = d;
        }
    }

    @Override // defpackage.dyn
    public final dyn d() {
        return new dyg(this.a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dyg) {
            return this.a.equals(((dyg) obj).a);
        }
        return false;
    }

    @Override // defpackage.dyn
    public final Boolean g() {
        boolean z = false;
        if (!Double.isNaN(this.a.doubleValue()) && this.a.doubleValue() != 0.0d) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.dyn
    public final Double h() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.dyn
    public final String i() {
        int scale;
        if (Double.isNaN(this.a.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(this.a.doubleValue())) {
            return this.a.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal stripTrailingZeros = BigDecimal.valueOf(this.a.doubleValue()).stripTrailingZeros();
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        if (stripTrailingZeros.scale() > 0) {
            scale = stripTrailingZeros.precision();
        } else {
            scale = stripTrailingZeros.scale();
        }
        decimalFormat.setMinimumFractionDigits(scale - 1);
        String format = decimalFormat.format(stripTrailingZeros);
        int indexOf = format.indexOf("E");
        if (indexOf <= 0) {
            return format;
        }
        int parseInt = Integer.parseInt(format.substring(indexOf + 1));
        if ((parseInt >= 0 || parseInt <= -7) && (parseInt < 0 || parseInt >= 21)) {
            return format.replace("E-", "e-").replace("E", "e+");
        }
        return stripTrailingZeros.toPlainString();
    }

    @Override // defpackage.dyn
    public final dyn ks(String str, dxk dxkVar, List list) {
        if (!"toString".equals(str)) {
            throw new IllegalArgumentException(String.format("%s.%s is not a function.", i(), str));
        }
        return new dyq(i());
    }

    @Override // defpackage.dyn
    public final Iterator l() {
        return null;
    }

    public final String toString() {
        return i();
    }
}
