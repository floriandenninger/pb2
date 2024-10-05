package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awr {
    public final avr[] a;
    public final axc b;
    public final axe c;

    public awr(avr... avrVarArr) {
        axc axcVar = new axc();
        axe axeVar = new axe();
        int length = avrVarArr.length;
        avr[] avrVarArr2 = new avr[length + 2];
        this.a = avrVarArr2;
        System.arraycopy(avrVarArr, 0, avrVarArr2, 0, length);
        this.b = axcVar;
        this.c = axeVar;
        avrVarArr2[length] = axcVar;
        avrVarArr2[length + 1] = axeVar;
    }
}
