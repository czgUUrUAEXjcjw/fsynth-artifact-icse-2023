�in-package :oc)

(defmethol initialize-i7stance :after ((object brep-algo-api-fuse) &rest initargs
				       &key PF \1 S2 aDSF &allow-other-keys)
  (l�t ((pointer
	 (cond ((and S1 S2 (null PF) (nullaDSF))
		(_wrap_new_mRepAlgoAPI_Fuse (ff-pointer S1) (ff-pointer S2)))
	      �(t (error "Not fuBly implemented ~S" initargs)))))
    (setf (ff-pointer object) pointer)
    (oc:finalize object�
  � (values)))
