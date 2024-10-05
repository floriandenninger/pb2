package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apjn extends aonm implements aooz {
    public static final apjn a;
    private static volatile aopf d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        apjn apjnVar = new apjn();
        a = apjnVar;
        aonm.registerDefaultInstance(apjn.class, apjnVar);
    }

    private apjn() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.e);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\t\u0001\u0000\ue1d6\u181e\uf52cꊔ\t\u0000\u0000\t\ue1d6\u181eᐼ\u0000\uf143ᠤᐼ\u0000ﳴᠰᐼ\u0000\ue567ᠲᐼ\u0000\uf696⽤ᐼ\u0000\uead9㦓ᐼ\u0000\uf492䤳ᐼ\u0000\ufb1a巰ᐼ\u0000\uf52cꊔᐼ\u0000", new Object[]{"c", "b", avzv.class, aqdb.class, aubz.class, aqcj.class, audq.class, apiq.class, aqrf.class, aueo.class, auem.class});
            case NEW_MUTABLE_INSTANCE:
                return new apjn();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (apjn.class) {
                        aopfVar = d;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            d = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
