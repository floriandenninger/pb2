package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asqb extends aonm implements aooz {
    public static final asqb a;
    private static volatile aopf h;
    public int b;
    public long c;
    public long d;
    public long e;
    public asqa f;
    public aqyg g;
    private byte i = 2;

    static {
        asqb asqbVar = new asqb();
        a = asqbVar;
        aonm.registerDefaultInstance(asqb.class, asqbVar);
    }

    private asqb() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0002\u0001ဂ\u0000\u0002ဂ\u0001\u0005ᐉ\u0005\u0006ဂ\u0004\u0007ᐉ\u0006", new Object[]{"b", "c", "d", "f", "e", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new asqb();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (asqb.class) {
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
