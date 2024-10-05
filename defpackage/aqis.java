package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqis extends aonm implements aooz {
    public static final aqis a;
    private static volatile aopf h;
    public int b;
    public aulq e;
    public apxf f;
    public apxf g;
    private aota i;
    private byte j = 2;
    public aony c = emptyProtobufList();
    public aony d = emptyProtobufList();

    static {
        aqis aqisVar = new aqis();
        a = aqisVar;
        aonm.registerDefaultInstance(aqis.class, aqisVar);
    }

    private aqis() {
        emptyProtobufList();
        aomf aomfVar = aomf.b;
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0002\u0006\u0001Л\u0002Л\u0004ᐉ\u0004\u0006ᐉ\u0001\u0007ᐉ\u0002\bᐉ\u0000", new Object[]{"b", "c", aulq.class, "d", aulq.class, "i", "f", "g", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new aqis();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (aqis.class) {
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
