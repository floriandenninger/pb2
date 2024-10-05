package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arol extends aonm implements aooz {
    public static final arol a;
    private static volatile aopf h;
    public int b;
    public arnb c;
    public aroo f;
    public arok g;
    private byte i = 2;
    public String d = "";
    public aony e = aonm.emptyProtobufList();

    static {
        arol arolVar = new arol();
        a = arolVar;
        aonm.registerDefaultInstance(arol.class, arolVar);
    }

    private arol() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0003\u001a\u0004ဉ\u0002\u0005ဉ\u0003", new Object[]{"b", "c", "d", "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new arol();
            case NEW_BUILDER:
                return new aone((char[][]) null, (int[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (arol.class) {
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
