package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atde extends aonm implements aooz {
    public static final atde a;
    private static volatile aopf j;
    public int b;
    public aqyg c;
    public arfs d;
    public apxf e;
    public apxf f;
    public boolean h;
    public int i;
    private aqyg k;
    private aota l;
    private byte m = 2;
    public aomf g = aomf.b;

    static {
        atde atdeVar = new atde();
        a = atdeVar;
        aonm.registerDefaultInstance(atde.class, atdeVar);
    }

    private atde() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.m);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.m = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\u000e\t\u0000\u0000\u0006\u0001ᐉ\u0000\u0002ᐉ\u0002\u0003ᐉ\u0003\u0004ᐉ\u0005\u0005ည\u0006\tᐉ\u0001\nᐉ\u0004\fဇ\t\u000eဌ\u000b", new Object[]{"b", "c", "d", "e", "l", "g", "k", "f", "h", "i", atbk.k});
            case NEW_MUTABLE_INSTANCE:
                return new atde();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (atde.class) {
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
