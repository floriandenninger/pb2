package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aovq extends aonm implements aooz {
    public static final aovq a;
    private static volatile aopf j;
    public int b;
    public aovr c;
    public aovs d;
    public aovt e;
    public aovu f;
    public aovp g;
    public aovv h;
    public aqih i;
    private byte k = 2;

    static {
        aovq aovqVar = new aovq();
        a = aovqVar;
        aonm.registerDefaultInstance(aovq.class, aovqVar);
    }

    private aovq() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.k);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\ueec5Ⓩ\ue7d0䥠\u0007\u0000\u0000\u0001\ueec5Ⓩဉ\u0002\uef11Ⓩဉ\u0003ﮎⓐဉ\u0000\uf120⤣ᐉ\u0007２䕛ဉ\n\ue3b9䜗ဉ\u0004\ue7d0䥠ဉ\u000b", new Object[]{"b", "d", "e", "c", "g", "h", "f", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new aovq();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (aovq.class) {
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
