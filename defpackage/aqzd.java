package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqzd extends aonm implements aooz {
    public static final aqzd a;
    private static volatile aopf m;
    public int b;
    public aqyg c;
    public aqyg e;
    public aqyg g;
    public apxf h;
    public aqyg i;
    public avvd j;
    private aota n;
    private byte o = 2;
    public String d = "";
    public String f = "";
    public String k = "";
    public aomf l = aomf.b;

    static {
        aqzd aqzdVar = new aqzd();
        a = aqzdVar;
        aonm.registerDefaultInstance(aqzd.class, aqzdVar);
    }

    private aqzd() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.o);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.o = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0007\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ဈ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0007\tဈ\b\nᐉ\t\u000bည\n", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "n", "l"});
            case NEW_MUTABLE_INSTANCE:
                return new aqzd();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = m;
                if (aopfVar == null) {
                    synchronized (aqzd.class) {
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
