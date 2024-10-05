package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqkj extends aonm implements aooz {
    public static final aqkj a;
    public static final aonk b;
    private static volatile aopf l;
    public int c;
    public awos h;
    public awnw i;
    public awnw j;
    public aqrd k;
    private byte m = 2;
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";

    static {
        aqkj aqkjVar = new aqkj();
        a = aqkjVar;
        aonm.registerDefaultInstance(aqkj.class, aqkjVar);
        b = aonm.newSingularGeneratedExtension(awnw.a, aqkjVar, aqkjVar, null, 183321338, aoqn.MESSAGE, aqkj.class);
    }

    private aqkj() {
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0000\u0004\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ᐉ\u0005\u0006ᐉ\u0006\u0007ᐉ\u0004\nᐉ\t", new Object[]{"c", "d", "e", "f", "g", "i", "j", "h", "k"});
            case NEW_MUTABLE_INSTANCE:
                return new aqkj();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = l;
                if (aopfVar == null) {
                    synchronized (aqkj.class) {
                        aopfVar = l;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            l = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
