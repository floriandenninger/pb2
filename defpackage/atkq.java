package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atkq extends aonm implements aooz {
    public static final atkq a;
    private static volatile aopf b;
    private int c;
    private aota d;
    private aulq e;
    private apxf f;
    private apxf g;
    private aulq h;
    private aulq i;
    private byte j = 2;

    static {
        atkq atkqVar = new atkq();
        a = atkqVar;
        aonm.registerDefaultInstance(atkq.class, atkqVar);
    }

    private atkq() {
        aomf aomfVar = aomf.b;
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0010\u0006\u0000\u0000\u0006\u0001ᐉ\u0000\u0006ᐉ\u0005\tᐉ\b\rᐉ\u0006\u000fᐉ\u0007\u0010ᐉ\f", new Object[]{"c", "d", "e", "h", "f", "g", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new atkq();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (atkq.class) {
                        aopfVar = b;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            b = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
