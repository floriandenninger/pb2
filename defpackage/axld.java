package defpackage;

import java.util.Date;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axld implements Cloneable {
    public long b;
    public double f;
    public double g;
    public float h;
    public int j;
    public String a = "eng";
    public Date c = new Date();
    public Date d = new Date();
    public axnb e = axnb.a;
    public long i = 1;

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }
}
