package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agi {
    public final boolean a;
    final String b;
    public int c;
    public float d;
    public String e;
    public boolean f;
    public int g;
    public final int h;

    public agi(agi agiVar, Object obj) {
        this.a = false;
        this.b = agiVar.b;
        this.h = agiVar.h;
        a(obj);
    }

    public final void a(Object obj) {
        int i = this.h;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        switch (i2) {
            case 0:
            case 7:
                this.c = ((Integer) obj).intValue();
                return;
            case 1:
                this.d = ((Float) obj).floatValue();
                return;
            case 2:
            case 3:
                this.g = ((Integer) obj).intValue();
                return;
            case 4:
                this.e = (String) obj;
                return;
            case 5:
                this.f = ((Boolean) obj).booleanValue();
                return;
            case 6:
                this.d = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }

    public agi(String str, int i, Object obj, boolean z) {
        this.b = str;
        this.h = i;
        this.a = z;
        a(obj);
    }
}
