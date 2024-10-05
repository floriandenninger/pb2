package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asiu extends aonm implements aooz {
    public static final asiu a;
    private static volatile aopf l;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public float j;
    public boolean k;

    static {
        asiu asiuVar = new asiu();
        a = asiuVar;
        aonm.registerDefaultInstance(asiu.class, asiuVar);
    }

    private asiu() {
        emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001 \t\u0000\u0000\u0000\u0001ဇ\u0000\u0011ဇ\u0010\u0018ဇ\u0015\u0019ဇ\u0016\u001aဇ\u0017\u001cဇ\u0019\u001dဇ\u001a\u001eခ\u001b ဇ\u001d", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
            case NEW_MUTABLE_INSTANCE:
                return new asiu();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = l;
                if (aopfVar == null) {
                    synchronized (asiu.class) {
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
