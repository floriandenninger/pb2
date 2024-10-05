package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asip extends aonm implements aooz {
    public static final asip a;
    private static volatile aopf m;
    public int b;
    public long c;
    public long d;
    public float f;
    public long g;
    public boolean i;
    public boolean j;
    public boolean k;
    private boolean n;
    private boolean o;
    public String e = "";
    public String h = "";
    public String l = "";

    static {
        asip asipVar = new asip();
        a = asipVar;
        aonm.registerDefaultInstance(asip.class, asipVar);
    }

    private asip() {
    }

    public static /* synthetic */ void a(asip asipVar) {
        asipVar.b |= 1;
        asipVar.n = true;
    }

    public static /* synthetic */ void b(asip asipVar) {
        asipVar.b |= 2;
        asipVar.o = true;
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
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0001\u000e\f\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ခ\u0005\u0007ဂ\u0006\bဈ\b\u000bဇ\n\fဇ\u000b\rဇ\f\u000eဈ\r", new Object[]{"b", "n", "o", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"});
            case NEW_MUTABLE_INSTANCE:
                return new asip();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = m;
                if (aopfVar == null) {
                    synchronized (asip.class) {
                        aopfVar = m;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            m = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
