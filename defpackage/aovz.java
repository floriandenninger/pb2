package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aovz extends aonm implements aooz {
    public static final aovz a;
    public static final aonk b;
    private static volatile aopf g;
    public awnw c;
    public awnw d;
    public aoyh e;
    private int h;
    private byte i = 2;
    public String f = "";

    static {
        aovz aovzVar = new aovz();
        a = aovzVar;
        aonm.registerDefaultInstance(aovz.class, aovzVar);
        b = aonm.newSingularGeneratedExtension(awqd.a, aovzVar, aovzVar, null, 201264127, aoqn.MESSAGE, aovz.class);
    }

    private aovz() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.i);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ဉ\u0002\u0004ဈ\u0003", new Object[]{"h", "c", "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new aovz();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (aovz.class) {
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
