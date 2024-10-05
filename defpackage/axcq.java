package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axcq extends aonm implements aooz {
    private static final axcq a;
    private static volatile aopf b;
    private int c = 0;
    private Object d;

    static {
        axcq axcqVar = new axcq();
        a = axcqVar;
        aonm.registerDefaultInstance(axcq.class, axcqVar);
    }

    private axcq() {
    }

    public void A(axdu axduVar) {
        axduVar.getClass();
        this.d = axduVar;
        this.c = 3;
    }

    public void B(axeb axebVar) {
        axebVar.getClass();
        this.d = axebVar;
        this.c = 1;
    }

    public void C(axdm axdmVar) {
        this.d = Integer.valueOf(axdmVar.d);
        this.c = 13;
    }

    public void D(axeg axegVar) {
        axegVar.getClass();
        this.d = axegVar;
        this.c = 7;
    }

    public static axcl a() {
        return (axcl) a.createBuilder();
    }

    public static /* synthetic */ axcq b() {
        return a;
    }

    public void r(axbn axbnVar) {
        axbnVar.getClass();
        this.d = axbnVar;
        this.c = 6;
    }

    public void s(axcd axcdVar) {
        axcdVar.getClass();
        this.d = axcdVar;
        this.c = 11;
    }

    public void t(axcg axcgVar) {
        axcgVar.getClass();
        this.d = axcgVar;
        this.c = 8;
    }

    public void u(axcn axcnVar) {
        axcnVar.getClass();
        this.d = axcnVar;
        this.c = 4;
    }

    public void v(axdk axdkVar) {
        axdkVar.getClass();
        this.d = axdkVar;
        this.c = 2;
    }

    public void w(axco axcoVar) {
        axcoVar.getClass();
        this.d = axcoVar;
        this.c = 12;
    }

    public void x(axdo axdoVar) {
        axdoVar.getClass();
        this.d = axdoVar;
        this.c = 15;
    }

    public void y(axdr axdrVar) {
        axdrVar.getClass();
        this.d = axdrVar;
        this.c = 9;
    }

    public void z(axdt axdtVar) {
        axdtVar.getClass();
        this.d = axdtVar;
        this.c = 14;
    }

    public axdr c() {
        return this.c == 9 ? (axdr) this.d : axdr.e();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u000f\u0001\u0000\u0001\u000f\u000f\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000\bြ\u0000\tြ\u0000\nြ\u0000\u000bြ\u0000\fြ\u0000\rဿ\u0000\u000eြ\u0000\u000fြ\u0000", new Object[]{"d", "c", axeb.class, axdk.class, axdu.class, axcn.class, axcp.class, axbn.class, axeg.class, axcg.class, axdr.class, axbt.class, axcd.class, axco.class, axdm.a(), axdt.class, axdo.class});
            case NEW_MUTABLE_INSTANCE:
                return new axcq();
            case NEW_BUILDER:
                return new axcl();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (axcq.class) {
                        aopfVar = b;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            b = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public boolean q() {
        return this.c == 9;
    }
}
