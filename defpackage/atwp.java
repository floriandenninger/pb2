package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atwp extends aonm implements aooz {
    public static final atwp a;
    public static final aonk b;
    private static volatile aopf f;
    public int c;
    public awnw d;
    public awnw e;
    private awnw g;
    private byte h = 2;

    static {
        atwp atwpVar = new atwp();
        a = atwpVar;
        aonm.registerDefaultInstance(atwp.class, atwpVar);
        b = aonm.newSingularGeneratedExtension(awqd.a, atwpVar, atwpVar, null, 347675936, aoqn.MESSAGE, atwp.class);
    }

    private atwp() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.h);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0004\u0006\u0003\u0000\u0000\u0003\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005", new Object[]{"c", "d", "e", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new atwp();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (atwp.class) {
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
