package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aplr extends aonm implements aooz {
    public static final aplr a;
    private static volatile aopf f;
    public aulq b;
    public aulq c;
    public aulq d;
    public aulq e;
    private int g;
    private apxf h;
    private aqyg i;
    private byte j = 2;

    static {
        aplr aplrVar = new aplr();
        a = aplrVar;
        aonm.registerDefaultInstance(aplr.class, aplrVar);
    }

    private aplr() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0007ᐉ\u0006", new Object[]{"g", "h", "b", "c", "d", "e", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new aplr();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (aplr.class) {
                        aopfVar = f;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            f = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
