package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atke extends aonm implements aooz {
    public static final atke a;
    private static volatile aopf h;
    public int b;
    public avgg c;
    public aqyg d;
    public aqyg e;
    public atkd f;
    private aota i;
    private byte j = 2;
    public aomf g = aomf.b;

    static {
        atke atkeVar = new atke();
        a = atkeVar;
        aonm.registerDefaultInstance(atke.class, atkeVar);
    }

    private atke() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.j);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0004\u0005ည\u0005\u0006ဉ\u0003", new Object[]{"b", "c", "d", "e", "i", "g", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new atke();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (atke.class) {
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
