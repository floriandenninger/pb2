package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awug extends aonm implements aooz {
    public static final awug a;
    public static final aonk b;
    private static volatile aopf h;
    public int c;
    public awos d;
    public awos e;
    private byte i = 2;
    public aony f = emptyProtobufList();
    public String g = "";

    static {
        awug awugVar = new awug();
        a = awugVar;
        aonm.registerDefaultInstance(awug.class, awugVar);
        b = aonm.newSingularGeneratedExtension(awnw.a, awugVar, awugVar, null, 352829283, aoqn.MESSAGE, awug.class);
    }

    private awug() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003Л\u0004ဈ\u0002", new Object[]{"c", "d", "e", "f", awos.class, "g"});
            case NEW_MUTABLE_INSTANCE:
                return new awug();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (awug.class) {
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
