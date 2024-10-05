package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auwv extends aonm implements aooz {
    public static final auwv a;
    private static volatile aopf g;
    public aulq b;
    public aulq c;
    public aulq d;
    private int h;
    private apxf i;
    private aota j;
    private byte k = 2;
    public aony e = emptyProtobufList();
    public aomf f = aomf.b;

    static {
        auwv auwvVar = new auwv();
        a = auwvVar;
        aonm.registerDefaultInstance(auwv.class, auwvVar);
    }

    private auwv() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004Л\u0005ᐉ\u0004\u0006ည\u0005\u0007ᐉ\u0003", new Object[]{"h", "b", "c", "d", "e", aulq.class, "j", "f", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new auwv();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (auwv.class) {
                        aopfVar = g;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            g = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
