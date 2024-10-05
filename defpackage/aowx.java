package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aowx extends aonm implements aooz {
    public static final aowx a;
    private static volatile aopf j;
    public int b;
    public avgg c;
    public avgg d;
    public aqyg e;
    public aqyg f;
    public aqyg g;
    public apxf h;
    private aota k;
    private byte l = 2;
    public aomf i = aomf.b;

    static {
        aowx aowxVar = new aowx();
        a = aowxVar;
        aonm.registerDefaultInstance(aowx.class, aowxVar);
    }

    private aowx() {
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0007\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bည\u0007", new Object[]{"b", "c", "d", "e", "f", "g", "h", "k", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new aowx();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (aowx.class) {
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
