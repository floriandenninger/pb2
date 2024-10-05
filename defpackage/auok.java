package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auok extends aonm implements aooz {
    public static final auok a;
    public static final aonk b;
    private static volatile aopf k;
    public int c;
    public Object e;
    public arfs f;
    public apxf i;
    public boolean j;
    private aota l;
    public int d = 0;
    private byte m = 2;
    public aony g = emptyProtobufList();
    public aomf h = aomf.b;

    static {
        auok auokVar = new auok();
        a = auokVar;
        aonm.registerDefaultInstance(auok.class, auokVar);
        b = aonm.newSingularGeneratedExtension(aulp.a, auokVar, auokVar, null, 106506504, aoqn.MESSAGE, auok.class);
    }

    private auok() {
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
                return newMessageInfo(a, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0001\u0006\u0001ᐼ\u0000\u0002ᐼ\u0000\u0003Л\u0004ᐉ\u0003\u0005ည\u0004\u0006ᐉ\u0002\u0007ᐉ\u0005\bဇ\u0006", new Object[]{"e", "d", "c", auol.class, aqyg.class, "g", auom.class, "l", "h", "f", "i", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new auok();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = k;
                if (aopfVar == null) {
                    synchronized (auok.class) {
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
