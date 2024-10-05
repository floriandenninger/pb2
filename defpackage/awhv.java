package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awhv extends aonm implements aooz {
    public static final awhv a;
    private static volatile aopf k;
    public int b;
    public awhu c;
    public aqyg e;
    public aulq f;
    public aulq g;
    private aota l;
    private byte m = 2;
    public aony d = emptyProtobufList();
    public aony h = emptyProtobufList();
    public aony i = emptyProtobufList();
    public aomf j = aomf.b;

    static {
        awhv awhvVar = new awhv();
        a = awhvVar;
        aonm.registerDefaultInstance(awhv.class, awhvVar);
    }

    private awhv() {
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0003\b\u0001ᐉ\u0000\u0002Л\u0003ᐉ\u0001\u0004ᐉ\u0002\u0005ᐉ\u0003\u0006Л\u0007Л\bᐉ\u0004\tည\u0005", new Object[]{"b", "c", "d", awht.class, "e", "f", "g", "h", apxf.class, "i", apxf.class, "l", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new awhv();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = k;
                if (aopfVar == null) {
                    synchronized (awhv.class) {
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
