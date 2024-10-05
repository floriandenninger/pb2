package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auox extends aonm implements aooz {
    public static final auox a;
    private static volatile aopf h;
    public int b;
    public atmt c;
    public aufe d;
    public aulm e;
    public asjj f;
    public avgs g;
    private byte i = 2;

    static {
        auox auoxVar = new auox();
        a = auoxVar;
        aonm.registerDefaultInstance(auox.class, auoxVar);
    }

    private auox() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.i);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\ueee9ᣑ\uf488┤\u0005\u0000\u0000\u0002\ueee9ᣑᐉ\u0000\ueeedᣑဉ\u0001\uf697᳗ᐉ\u0002\uec98↊ဉ\u0004\uf488┤ဉ\u0003", new Object[]{"b", "c", "d", "e", "g", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new auox();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (auox.class) {
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
