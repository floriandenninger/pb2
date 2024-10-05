package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atdn extends aonm implements aooz {
    public static final atdn a;
    private static volatile aopf j;
    public int b;
    public Object d;
    public aqyg e;
    public atdq f;
    public atdo g;
    public apmh h;
    private apmh k;
    private aota l;
    public int c = 0;
    private byte m = 2;
    public aomf i = aomf.b;

    static {
        atdn atdnVar = new atdn();
        a = atdnVar;
        aonm.registerDefaultInstance(atdn.class, atdnVar);
    }

    private atdn() {
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
                return newMessageInfo(a, "\u0001\t\u0001\u0001\u0001\t\t\u0000\u0000\u0006\u0001ᐉ\u0000\u0002ြ\u0000\u0003ᐉ\u0007\u0004ည\b\u0005ᐉ\u0005\u0006ᐉ\u0001\u0007ᐼ\u0000\bဉ\u0004\tᐉ\u0006", new Object[]{"d", "c", "b", "e", atdt.class, "l", "i", "h", "f", atds.class, "g", "k"});
            case NEW_MUTABLE_INSTANCE:
                return new atdn();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (atdn.class) {
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
