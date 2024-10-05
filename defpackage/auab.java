package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auab extends aonm implements aooz {
    public static final auab a;
    private static volatile aopf g;
    public aulq c;
    private int h;
    private aota i;
    private byte j = 2;
    public aony b = emptyProtobufList();
    public aony d = emptyProtobufList();
    public String e = "";
    public aomf f = aomf.b;

    static {
        auab auabVar = new auab();
        a = auabVar;
        aonm.registerDefaultInstance(auab.class, auabVar);
    }

    private auab() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0002\b\u0006\u0000\u0002\u0003\u0002\u001b\u0004ᐉ\u0000\u0005ည\u0002\u0006ᐉ\u0003\u0007ဈ\u0001\bЛ", new Object[]{"h", "b", avyc.class, "c", "f", "i", "e", "d", aulq.class});
            case NEW_MUTABLE_INSTANCE:
                return new auab();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (auab.class) {
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
