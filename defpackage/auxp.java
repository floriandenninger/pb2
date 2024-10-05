package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auxp extends aonm implements aooz {
    private static final auxp a;
    private static volatile aopf b;
    private int c;
    private boolean d;
    private aqyg e;
    private aqyg f;
    private aqyg g;
    private aqyg h;
    private aqyg i;
    private aqyg j;
    private byte k = 2;

    static {
        auxp auxpVar = new auxp();
        a = auxpVar;
        aonm.registerDefaultInstance(auxp.class, auxpVar);
    }

    private auxp() {
    }

    public static auxp h() {
        return a;
    }

    public aqyg a() {
        aqyg aqygVar = this.j;
        return aqygVar == null ? aqyg.a : aqygVar;
    }

    public aqyg b() {
        aqyg aqygVar = this.g;
        return aqygVar == null ? aqyg.a : aqygVar;
    }

    public aqyg c() {
        aqyg aqygVar = this.h;
        return aqygVar == null ? aqyg.a : aqygVar;
    }

    public aqyg d() {
        aqyg aqygVar = this.i;
        return aqygVar == null ? aqyg.a : aqygVar;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.k);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0002\b\u0007\u0000\u0000\u0006\u0002ဇ\u0000\u0003ᐉ\u0001\u0004ᐉ\u0002\u0005ᐉ\u0003\u0006ᐉ\u0004\u0007ᐉ\u0005\bᐉ\u0006", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new auxp();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (auxp.class) {
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

    public aqyg e() {
        aqyg aqygVar = this.e;
        return aqygVar == null ? aqyg.a : aqygVar;
    }

    public aqyg f() {
        aqyg aqygVar = this.f;
        return aqygVar == null ? aqyg.a : aqygVar;
    }

    public boolean i() {
        return this.d;
    }

    public boolean j() {
        return (this.c & 64) != 0;
    }

    public boolean k() {
        return (this.c & 8) != 0;
    }

    public boolean l() {
        return (this.c & 16) != 0;
    }

    public boolean m() {
        return (this.c & 32) != 0;
    }

    public boolean n() {
        return (this.c & 2) != 0;
    }

    public boolean o() {
        return (this.c & 4) != 0;
    }
}
