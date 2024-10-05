package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awty extends aonh implements aoni {
    public static final awty a;
    public static final aonk b;
    private static volatile aopf j;
    public int c;
    public awos d;
    public awos e;
    public awnw h;
    public boolean i;
    private byte k = 2;
    public aony f = emptyProtobufList();
    public String g = "";

    static {
        awty awtyVar = new awty();
        a = awtyVar;
        aonm.registerDefaultInstance(awty.class, awtyVar);
        b = aonm.newSingularGeneratedExtension(awnw.a, awtyVar, awtyVar, null, 278463287, aoqn.MESSAGE, awty.class);
    }

    private awty() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.k);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003Л\u0004ဈ\u0002\u0005ᐉ\u0003\u0007ဇ\u0005", new Object[]{"c", "d", "e", "f", awos.class, "g", "h", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new awty();
            case NEW_BUILDER:
                return new aong(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (awty.class) {
                        aopfVar = j;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            j = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
