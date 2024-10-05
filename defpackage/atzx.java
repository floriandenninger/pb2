package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atzx extends aonm implements aooz {
    public static final atzx a;
    public static final aonk b;
    private static volatile aopf h;
    public int c;
    public aqyg f;
    private aota i;
    private byte j = 2;
    public aony d = emptyProtobufList();
    public aony e = emptyProtobufList();
    public aomf g = aomf.b;

    static {
        atzx atzxVar = new atzx();
        a = atzxVar;
        aonm.registerDefaultInstance(atzx.class, atzxVar);
        b = aonm.newSingularGeneratedExtension(aulp.a, atzxVar, atzxVar, null, 57158578, aoqn.MESSAGE, atzx.class);
    }

    private atzx() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0004\u0001Л\u0002ᐉ\u0000\u0003ᐉ\u0001\u0004ည\u0002\u0005Л", new Object[]{"c", "d", atzz.class, "f", "i", "g", "e", atzy.class});
            case NEW_MUTABLE_INSTANCE:
                return new atzx();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (atzx.class) {
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
