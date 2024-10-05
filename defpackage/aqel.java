package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqel extends aonm implements aooz {
    public static final aqel a;
    public static final aonk b;
    private static volatile aopf l;
    public atct c;
    public atct d;
    public atct e;
    public atct f;
    public atct g;
    public atct h;
    public atct i;
    public atct j;
    public atct k;
    private int m;
    private byte n = 2;

    static {
        aqel aqelVar = new aqel();
        a = aqelVar;
        aonm.registerDefaultInstance(aqel.class, aqelVar);
        b = aonm.newSingularGeneratedExtension(aqik.a, aqelVar, aqelVar, null, 146552955, aoqn.MESSAGE, aqel.class);
    }

    private aqel() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.n);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.n = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\t\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0006\u0007ᐉ\u0007\bᐉ\u0005\tᐉ\b", new Object[]{"m", "c", "d", "e", "f", "g", "i", "j", "h", "k"});
            case NEW_MUTABLE_INSTANCE:
                return new aqel();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = l;
                if (aopfVar == null) {
                    synchronized (aqel.class) {
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
