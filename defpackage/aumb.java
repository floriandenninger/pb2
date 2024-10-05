package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aumb extends aonm implements aooz {
    public static final aumb a;
    private static volatile aopf j;
    public int b;
    public atsy c;
    public aqyg d;
    public aqyg e;
    public apmh f;
    public apmh g;
    public aplk h;
    private aqyg k;
    private apmh l;
    private aplk m;
    private aota n;
    private byte o = 2;
    public aomf i = aomf.b;

    static {
        aumb aumbVar = new aumb();
        a = aumbVar;
        aonm.registerDefaultInstance(aumb.class, aumbVar);
    }

    private aumb() {
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
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\n\u0001ᐉ\u0000\u0002ᐉ\t\u0003ည\n\u0004ᐉ\u0001\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0002\bᐉ\u0003\tᐉ\u0006\nᐉ\u0007\u000bᐉ\b", new Object[]{"b", "c", "n", "i", "d", "f", "l", "k", "e", "g", "h", "m"});
            case NEW_MUTABLE_INSTANCE:
                return new aumb();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (aumb.class) {
                        aopfVar = j;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            j = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
