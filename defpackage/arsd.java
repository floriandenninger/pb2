package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arsd extends aonm implements aooz {
    public static final arsd a;
    private static volatile aopf m;
    public int b;
    public arnd c;
    public aukg d;
    public aryr e;
    public apxf f;
    public apxf g;
    public int h;
    public int j;
    public apxf k;
    private aota n;
    private aqzg o;
    private aulq p;
    private byte q = 2;
    public aomf i = aomf.b;
    public String l = "";

    static {
        arsd arsdVar = new arsd();
        a = arsdVar;
        aonm.registerDefaultInstance(arsd.class, arsdVar);
    }

    private arsd() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.q);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.q = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\r\u0000\u0001\u0001̉\r\u0000\u0000\t\u0001ᐉ\u0000\u0003ᐉ\u0001\u0004ᐉ\u0002\u0005ᐉ\u0003\u0006ᐉ\u0004\u0007ဌ\u0005\tᐉ\u0007\nည\b\fဌ\n\rᐉ\f\u000eဈ\r\u000fᐉ\u000ẻᐉ\u000b", new Object[]{"b", "c", "d", "e", "f", "g", "h", aujj.f, "n", "i", "j", aujq.a(), "k", "l", "p", "o"});
            case NEW_MUTABLE_INSTANCE:
                return new arsd();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = m;
                if (aopfVar == null) {
                    synchronized (arsd.class) {
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
