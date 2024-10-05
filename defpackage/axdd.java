package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axdd extends aonm implements aooz {
    private static final axdd a;
    private static volatile aopf b;
    private int c = 0;
    private Object d;

    static {
        axdd axddVar = new axdd();
        a = axddVar;
        aonm.registerDefaultInstance(axdd.class, axddVar);
    }

    private axdd() {
    }

    public axcg a() {
        return this.c == 8 ? (axcg) this.d : axcg.b();
    }

    public axda b() {
        return this.c == 6 ? (axda) this.d : axda.c();
    }

    public axdb c() {
        return this.c == 9 ? (axdb) this.d : axdb.c();
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
                return newMessageInfo(a, "\u0001\t\u0001\u0000\u0001\t\t\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000\bြ\u0000\tြ\u0000", new Object[]{"d", "c", axdu.class, axde.class, axdf.class, axdc.class, axdg.class, axda.class, axdk.class, axcg.class, axdb.class});
            case NEW_MUTABLE_INSTANCE:
                return new axdd();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (axdd.class) {
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

    public axde e() {
        return this.c == 2 ? (axde) this.d : axde.b();
    }

    public axdk f() {
        return this.c == 7 ? (axdk) this.d : axdk.l();
    }

    public axdu g() {
        return this.c == 1 ? (axdu) this.d : axdu.c();
    }

    public boolean h() {
        return this.c == 7;
    }

    public boolean i() {
        return this.c == 6;
    }

    public boolean j() {
        return this.c == 8;
    }

    public boolean k() {
        return this.c == 9;
    }

    public boolean l() {
        return this.c == 4;
    }

    public boolean m() {
        return this.c == 2;
    }

    public boolean n() {
        return this.c == 3;
    }

    public boolean o() {
        return this.c == 1;
    }

    public boolean p() {
        return this.c == 5;
    }
}
