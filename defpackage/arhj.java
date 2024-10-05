package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arhj extends aonm implements aooz {
    public static final arhj a;
    private static volatile aopf k;
    public int b;
    public aqyg c;
    public apxf i;
    public avgg j;
    private aota l;
    private byte m = 2;
    public aony d = emptyProtobufList();
    public aony e = emptyProtobufList();
    public aony f = emptyProtobufList();
    public aony g = emptyProtobufList();
    public aomf h = aomf.b;

    static {
        arhj arhjVar = new arhj();
        a = arhjVar;
        aonm.registerDefaultInstance(arhj.class, arhjVar);
    }

    private arhj() {
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0002\u0011\t\u0000\u0004\u0004\u0002ᐉ\u0000\u0004ᐉ\u0002\u0005ည\u0003\t\u001b\n\u001b\u000b\u001b\u000e\u001b\u0010ᐉ\u0006\u0011ᐉ\u0007", new Object[]{"b", "c", "l", "h", "d", asus.class, "e", asus.class, "f", asus.class, "g", asus.class, "i", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new arhj();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = k;
                if (aopfVar == null) {
                    synchronized (arhj.class) {
                        aopfVar = k;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            k = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
