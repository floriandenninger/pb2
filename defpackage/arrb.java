package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arrb extends aonm implements aooz {
    public static final arrb a;
    private static volatile aopf j;
    public int b;
    public arnb c;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    private byte k = 2;
    public aony d = aonm.emptyProtobufList();

    static {
        arrb arrbVar = new arrb();
        a = arrbVar;
        aonm.registerDefaultInstance(arrb.class, arrbVar);
    }

    private arrb() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0001\u0001ᐉ\u0000\u0002ဇ\u0006\u0003ဇ\u0007\u0004\u001a\u0005ဇ\u0002\u0006ဇ\u0003\u0007ဇ\u0004", new Object[]{"b", "c", "h", "i", "d", "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new arrb();
            case NEW_BUILDER:
                return new aone((char[][][]) null, (char[][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (arrb.class) {
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
