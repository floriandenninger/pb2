package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apez extends aonm implements aooz {
    public static final apez a;
    private static volatile aopf i;
    public int b;
    public long c;
    public long d;
    public int e;
    public avgg f;
    public auao g;
    private apxf j;
    private aota k;
    private byte l = 2;
    public aony h = emptyProtobufList();

    static {
        apez apezVar = new apez();
        a = apezVar;
        aonm.registerDefaultInstance(apez.class, apezVar);
    }

    private apez() {
        emptyProtobufList();
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.l);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\u0010\b\u0000\u0001\u0003\u0001ဂ\u0000\u0002ဂ\u0001\bᐉ\u0006\tᐉ\u0007\u000bᐉ\t\rဉ\b\u000e\u001b\u0010င\u0003", new Object[]{"b", "c", "d", "j", "f", "k", "g", "h", asus.class, "e"});
            case NEW_MUTABLE_INSTANCE:
                return new apez();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (apez.class) {
                        aopfVar = i;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            i = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
