package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqdy extends aonm implements aooz {
    public static final aqdy a;
    private static volatile aopf h;
    public int b;
    public aqyg c;
    public aqiz d;
    public long e;
    public apxf f;
    public String g;
    private apmh i;
    private apmh j;
    private aota k;
    private byte l = 2;

    static {
        aqdy aqdyVar = new aqdy();
        a = aqdyVar;
        aonm.registerDefaultInstance(aqdy.class, aqdyVar);
    }

    private aqdy() {
        aomf aomfVar = aomf.b;
        this.g = "";
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.l);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0005\u0007ᐉ\u0007\bဈ\b\tဂ\u0004", new Object[]{"b", "c", "d", "i", "j", "k", "f", "g", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new aqdy();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (aqdy.class) {
                        aopfVar = h;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            h = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
