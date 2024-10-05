package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avcx extends aonm implements aooz {
    public static final avcx a;
    private static volatile aopf k;
    public int b;
    public int c;
    public aqyg d;
    public aulq h;
    public avgg i;
    public aulq j;
    private aota l;
    private byte m = 2;
    public aony e = emptyProtobufList();
    public aony f = emptyProtobufList();
    public aony g = emptyProtobufList();

    static {
        avcx avcxVar = new avcx();
        a = avcxVar;
        aonm.registerDefaultInstance(avcx.class, avcxVar);
    }

    private avcx() {
        aomf aomfVar = aomf.b;
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\f\t\u0000\u0003\b\u0001ဋ\u0000\u0002ᐉ\u0001\u0003Л\u0004Л\u0005Л\u0006ᐉ\u0002\u0007ᐉ\u0003\tᐉ\u0005\fᐉ\b", new Object[]{"b", "c", "d", "e", apxf.class, "f", apxf.class, "g", apxf.class, "h", "i", "j", "l"});
            case NEW_MUTABLE_INSTANCE:
                return new avcx();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = k;
                if (aopfVar == null) {
                    synchronized (avcx.class) {
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
